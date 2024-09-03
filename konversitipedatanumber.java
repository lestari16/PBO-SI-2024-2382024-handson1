public class konversitipeDatanumber{
    public static void main(String[] args) {

        //widening dari kecil ke besar
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //narrowing dari besar ke kecil
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;//pake casting(..)

        //number overflow
        int tipeDataInteger = 128;
        byte tipeDataByteConverted = (byte) tipeDataInteger;
    System.out.println(tipeDataByteConverted);
    }
}
