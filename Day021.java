public class Day021 {
    public static void main(String[] args) {
        // hexadecimal to decimal
        String hexaDecimal = "0x64";
        Byte decByte = Byte.decode(hexaDecimal);
        System.out.println(decByte.TYPE);
        System.out.println(decByte + "\n");
        Short decShort = Short.decode(hexaDecimal);
        System.out.println(decShort.TYPE);
        System.out.println(decShort + "\n");
        Integer decInteger = Integer.decode(hexaDecimal);
        System.out.println(decInteger.TYPE);
        System.out.println(decInteger + "\n");
        Long decLong = Long.decode(hexaDecimal);
        System.out.println(decLong.TYPE);
        System.out.println(decLong + "\n");

    }
}
