package practice;

import java.util.Base64;

import java.io.*;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class KeyReader {
    public KeyReader() {
    }

    public static PublicKey loadPublicKeyFromString(String publicKeyPEM) throws Exception {
        publicKeyPEM = publicKeyPEM.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\\s", "");
        byte[] publicKeyDER = Base64.getDecoder().decode(publicKeyPEM);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyDER));
    }

    public static PrivateKey loadPrivateKeyFromString(String privateKeyPEM) throws Exception {
        privateKeyPEM = privateKeyPEM.replace("-----BEGIN PRIVATE KEY-----", "").replace("-----END PRIVATE KEY-----", "").replaceAll("\\s", "");
        byte[] privateKeyDER = Base64.getDecoder().decode(privateKeyPEM);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyDER));
    }

    public static PrivateKey loadPrivateKeyFromPEM(String path) throws Exception {
        String privateKeyPEM = readFile(path);
        return loadPrivateKeyFromString(privateKeyPEM);
    }

    public static PrivateKey loadPrivateKeyFromPEM(InputStreamReader inputStreamReader) throws Exception {
        String privateKeyPEM = readFile(inputStreamReader);
        return loadPrivateKeyFromString(privateKeyPEM);
    }

    public static PublicKey loadPublicKeyFromPEM(String path) throws Exception {
        String publicKeyPEM = readFile(path);
        return loadPublicKeyFromString(publicKeyPEM);
    }

    public static PublicKey loadPublicKeyFromPEM(InputStreamReader inputStreamReader) throws Exception {
        String publicKeyPEM = readFile(inputStreamReader);
        return loadPublicKeyFromString(publicKeyPEM);
    }

    public static PublicKey loadPublicKeyFromDER(InputStream in) throws Exception {
        DataInputStream dis = new DataInputStream(in);
        byte[] keyBytes = new byte[in.available()];
        dis.readFully(keyBytes);
        dis.close();
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public static PublicKey loadPublicKeyFromDER(File f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int)f.length()];
        dis.readFully(keyBytes);
        dis.close();
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public static PublicKey loadPublicKeyFromDER(String path) throws Exception {
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int)f.length()];
        dis.readFully(keyBytes);
        dis.close();
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    public static PrivateKey loadPrivateKeyFromDER(File f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int)f.length()];
        dis.readFully(keyBytes);
        dis.close();
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    public static PrivateKey loadPrivateKeyFromDER(String path) throws Exception {
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        byte[] keyBytes = new byte[(int)f.length()];
        dis.readFully(keyBytes);
        dis.close();
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    private static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        return readFile(br);
    }

    private static String readFile(InputStreamReader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        return readFile(br);
    }

    private static String readFile(BufferedReader br) throws IOException {
        try {
            StringBuilder sb = new StringBuilder();

            for(String line = br.readLine(); line != null; line = br.readLine()) {
                sb.append(line);
                sb.append("\n");
            }

            String var3 = sb.toString();
            return var3;
        } finally {
            br.close();
        }
    }
}