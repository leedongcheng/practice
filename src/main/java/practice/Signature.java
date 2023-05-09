package practice;


import com.google.gson.Gson;

import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.LinkedHashMap;


public class Signature {

    public static void main(String[] args) throws Exception {

        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("Detail", "");
        map.put("MchId", "NTUiParking");
        map.put("MethodName", "街口支付(正掃)");
        map.put("Result", "0000");
        map.put("StoreOrderNo", "A0000000000000");
        map.put("TotalFee", "15");
        map.put("LicensePlate", "AAA123");
        map.put("Place", "8");
        String requestJson = (new Gson()).toJson(map);
        System.out.println("[notify] requestJson = ");
        System.out.println(requestJson);


        java.security.Signature signaturePRI = java.security.Signature.getInstance("SHA256withRSA");
        PrivateKey privateKey = null;
        try {
            ClassLoader classLoader = Class.forName("mainTest.test.Signature").getClassLoader();
//            publicKey = KeyReader.loadPublicKeyFromDER(classLoader.getResourceAsStream("key/pub.der"));
            File file = new File("src/main/resources/key/pri.der");
//            File file = new File(classLoader.getResource("C:/Workspace_test/testPos/key/pri.der").getFile());
            privateKey = KeyReader.loadPrivateKeyFromDER(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        signaturePRI.initSign(privateKey);
        signaturePRI.update(requestJson.getBytes());
        byte[] sign = signaturePRI.sign();
        String signstr =Base64.getEncoder().encodeToString(sign);
        System.out.println("[notify] signstr = ");
        System.out.println(signstr);



        java.security.Signature signaturePUB = java.security.Signature.getInstance("SHA256withRSA");
        PublicKey publicKey = null;
        try {
            ClassLoader classLoader = Signature.class.getClassLoader();
//            System.out.println(classLoader.getResource(""));
            File file1 = new File(classLoader.getResource("key/pub.der").getFile());
//            publicKey = KeyReader.loadPublicKeyFromDER(classLoader.getResourceAsStream("key/pub.der"));
            publicKey = KeyReader.loadPublicKeyFromDER(new File("src/main/resources/key/pub.der"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        signaturePUB.initVerify(publicKey);
        signaturePUB.update(requestJson.getBytes());
        String s = "qtg+h0IRAI+khROzVVyel//U03v/MmL3gRu+Mabt6dbZo7J/L+qzxBz1MA54s4t/V4u4tNRqfmFkMod3dvXaWvzL17C3BlVJh+DHwTmbUDI53LEhvEzVlcaCtRs3b+Ga2xvChhdc+NaVDCBf7DxDkvLI64HSRFq+zrhcIMC3Mp4AV744R9D+zTwOVRst7gYu7PGZAROkbF67bvlmRrT5XlURES5IDeRpaYzI8pM58LrwhCuefYF7RCVxCh0POnCb9cq2XQCvuLxmkn98uOJ/JT+V/YtAc3H2RKlgx9Y10rWOhj5KcXlRXqVCpO6yifGlpI9N8TYrQ8nePWWcNTv8ZQ==";
        boolean check = signaturePUB.verify(Base64.getDecoder().decode(signstr));

        System.out.println("[notify] check = ");
        System.out.println(check);
    }
}
