/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

/**
 *
 * @author tuan anh
 */
public class DataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Byte || 8 bits = 1 byte || range: -127 -> 127 || default value: 0
        byte a = 127;
        
        // Short || 16 bits = 2 byte || range: -32.768 -> 23.767 || default value: 0
        short b = 23767;
        
        // Int || 32 bits = 4 byte || range: -2.147.483.648 -> 2,147,483,647 || default value: 0
        int c = 2147483647;
        
        // Long || 64 bits = 8 byte || range: -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807 || default value: 0L
        long d = 9223372036854775807l;
        
        // Float || 32 bits = 4 byte || range: 1.4E-45 -> 3.4028235E38 || default value: 0.0f
        float e = 3.123f;
        
        // Double || 64 bits = 8 byte || range: 4.9E-34 đến 1.7976931348623157E308 || default value: 0.0d
        double f = 9.123d;
        
        // Boolean || 1 bit || range: 0 -> 1 || default value: false
        boolean g = true;
        
        // Char || 16 bits = 2 byte || range: 0 -> 65,535 || default value: '\u0000'
        char h = 'a';
        
        //                              Primitive Type
        //                                    |
        //      |-----------------------------|-----------------------------|
        //      |                                                           |
        //    boolean                                                     Number
        //                                                                  |
        //                                                  |---------------|---------------|
        //                                                  |                               |
        //                                               Integer                        Floating-point
        //                                                  |                               |
        //                       |--------|--------|--------|--------|             |--------|--------|
        //                       |        |        |        |        |             |                 |
        //                      byte     short    int     long      char         float             double
        
        // ======================================== type conversion, type casting hay type coercion ========================================
        //  Wideing : byte -> short -> int -> long -> float -> double
        // Narrowing : double -> float -> long -> int -> short -> byte  
    }
    
}
