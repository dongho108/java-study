package javastudy.ch13;

import java.io.*;

public class FileInputOutputEx {
    public static void main(String[] args) {
        try {
            // FileTest1.txt 생성
            File FileTest1 = new File("FileTest1.txt");
            FileTest1.createNewFile();

            // test.txt 읽어옴
            FileReader fr = new FileReader("test.txt");

            // FileTest1.txt에 데이터를 쓰기위한 인스턴스 생성
            FileWriter fw = new FileWriter("FileTest1.txt");

            // FileTest1.txt에 데이터 쓰기
            int data = 0;
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }
            System.out.println();

            fr.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
