package org.example.design;

import org.example.design.facade.Ftp;
import org.example.design.facade.Reader;
import org.example.design.facade.SftpClient;
import org.example.design.facade.Writer;

public class FacadeMain {
    public static void main(String[] args){
        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/myuser");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        writer.fileDisconnect();
        reader.fileDisconnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.bar.co.kr", 22, "/home/youruser", "test.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
