package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ReadWriteCSV {
    public static void main(String[] args) throws Exception {
//        List<String> schools = new ArrayList<>(Arrays.asList("ttu"));
        List<String> schools = new ArrayList<>(Arrays.asList("chu", "cyut", "fcu", "ltu", "stu", "ttu", "yumt"));
        Set<String> ezschools = new HashSet<>();
        for (String school : schools) {

            File[] newListFile = new File("C:\\Users\\Fabian.Liao\\Desktop\\new" + school).listFiles();

            for (int i = 0; i < newListFile.length; i++) {
                File newfile = newListFile[i];
                File oldfile = new File("C:\\Users\\Fabian.Liao\\Desktop\\" + school + "\\" + newfile.getName());
                System.out.println(school + "_" + newfile.getName());

                List<String> newlines = fileReadLine(newfile);
                List<String> oldlines = fileReadLine(oldfile);

                for (String oldline : oldlines) {
                    if (!newlines.contains(oldline)) {
                        System.out.println(oldline);
                        System.out.println("==========================");
                    }
                }
            }


        }
        if (ezschools.size() > 0){
            List<String> ezschoolsL = new ArrayList<>(ezschools);
            Collections.sort(ezschoolsL);
            for (String one : ezschoolsL)
                System.out.println(one);
        }

    }

    public static List<String> fileReadLine(File csvFile) throws Exception {
        List<String> fileReadLine = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "UTF-8"))) {
            String line = br.readLine();

            while (line != null) {
                fileReadLine.add(line);
                line = br.readLine();
            }
        }
        return fileReadLine;
    }
}
