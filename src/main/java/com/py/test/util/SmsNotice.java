package com.py.test.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/**
 * Created by DavidWang on 16/8/11.
 */
public class SmsNotice {

//    public static void noticesms(String mobile, String content){
////        String account = "fcs00995";
////        String password = MathUtil.getMD5("558609");
//        String account = "meiwokeji";
//        String password = MathUtil.getMD5("96456458");
//        content = "userid=&account="+ account +"&password="+ password +"&mobile="+mobile+"&sendTime=&content="+ content;
//        String url = "http://sms.chanzor.com:8001/sms.aspx?action=send";
//        String result = SendSMS.SMS(content,url);
//        if (parserXml(result)) {
//
//        }
//    }

    /**
     * 将字符串解析为对应的XML文档
     * @param result
     * @return
     * @throws UnsupportedEncodingException
     */
    public static boolean parserXml(String result) throws UnsupportedEncodingException {
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(new ByteArrayInputStream(result.getBytes("utf-8")));
            Element users = document.getRootElement();
            for (Iterator i = users.elementIterator(); i.hasNext();) {
                Element user = (Element) i.next();
                String key = user.getName();
                String value = user.getText();
                if (key.equals("returnstatus") && value.equals("Success")){
                    return true;
                }
            }
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }

}
