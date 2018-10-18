package org.csource.fastdfs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UploadFileSender implements UploadCallback {
	private InputStream inStream;  
    
    public UploadFileSender(InputStream inStream) {  
        this.inStream = inStream;  
    }  
    
    @Override
    public int send(OutputStream out) throws IOException {  
        int readBytes;  
        while((readBytes = inStream.read()) > 0) {  
            out.write(readBytes);  
        }  
        return 0;  
    }  
}
