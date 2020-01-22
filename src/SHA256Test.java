import org.apache.commons.codec.digest.DigestUtils;


public class SHA256Test {
    public static void main(String[] args) {
        String a="jjjj";

        byte[]bytes= DigestUtils.sha256(a.getBytes());
       String aa=byte2Hex(bytes);
        System.out.println(aa);
    }
    private static String byte2Hex(byte[] bytes){
        StringBuffer stringBuffer = new StringBuffer();
        String temp = null;
        for (int i=0;i<bytes.length;i++){
            temp = Integer.toHexString(bytes[i] & 0xFF);
            if (temp.length()==1){
                //1得到一位的进行补0操作
                stringBuffer.append("0");
            }
                stringBuffer.append(temp);
            } return stringBuffer.toString();
    }
}
