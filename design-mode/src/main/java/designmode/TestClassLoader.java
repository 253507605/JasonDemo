package designmode;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Jason.Chen
 * @create 2023/9/1 9:56
 */
public class TestClassLoader extends ClassLoader{



    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        BufferedInputStream bis = null;
        ByteArrayOutputStream bos = null;
        Class clazz = null;
        try{
            bis = new BufferedInputStream(new FileInputStream(name));
            bos = new ByteArrayOutputStream();
            int len = 0;
            byte[] data = new byte[1024];
            while ((len = bis.read(data)) != -1){
                bos.write(data,0,len);
            }
            byte[] bytes = bos.toByteArray();
            clazz = defineClass(null,bytes,0,bytes.length);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return clazz;
    }
}
