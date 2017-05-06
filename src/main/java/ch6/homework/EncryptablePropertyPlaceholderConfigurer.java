package ch6.homework;

import java.io.IOException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 继承placeholder，对加密属性进行解密
 * @author adam
 *
 */
public class EncryptablePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	private String[] encryptPropNames = {"jdbc.username", "jdbc.password"};  
    
    @Override  
    protected String convertProperty(String propertyName, String propertyValue)  
    {  
          
        //如果在加密属性名单中发现该属性  
        if (isEncryptProp(propertyName))  
        {  
            String decryptValue = "";
//			try {
//				decryptValue = DESUtils.decrypt(propertyValue);
//				System.out.println(decryptValue);  
//			} catch (IOException e) {
//				e.printStackTrace();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}  
			return decryptValue;  
        }else {  
            return propertyValue;  
        }  
          
    }  
      
    private boolean isEncryptProp(String propertyName)  
    {  
        for (String encryptName : encryptPropNames)  
        {  
            if (encryptName.equals(propertyName))  
            {  
                return true;  
            }  
        }  
        return false;  
    }  
}
