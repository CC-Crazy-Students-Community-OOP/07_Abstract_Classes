package com.cc.java;

public class Out {
    public static void o( String o ) { System.out.println( o ); }
    public static void o( double o ) { System.out.println( o ); }
    public static void o( float o ) { System.out.println( o ); }
    public static void o( int o ) { System.out.println( o ); }

    public static String c( String c ) {
        switch ( c ) {
            case "#r": return "\u001b[31m";
            case "#g": return "\u001b[32m";
            case "#y": return "\u001b[33m";
            case "#b": return "\u001b[34m";
            case "#p": return "\u001b[35m";
            case "#c": return "\u001b[36m";
            default: return "\u001b[0m";
        }
    }

    public static String t( int t ) {
        switch ( t ) {
            case 1: return "\t";
            case 2: return "\t\t";
            case 3: return "\t\t\t";
            case 5: return "\t\t\t\t";
            default: return "";
        }
    }
    
    public static String l() { return "========================================="; }
    public static String l( String d ) {  return "===" + d; }
    public static String n() { return "\n"; }
}