/* Generated By:JavaCC: Do not edit this line. SoapReaderConstants.java */
package ajeffrey.teaching.minisoap;

public interface SoapReaderConstants {

  int EOF = 0;
  int BEGINSTRING = 1;
  int BEGININT = 2;
  int BEGINHANDLE = 3;
  int BEGINOBJECT = 4;
  int ENDOBJECT = 5;
  int BEGINARRAY = 6;
  int ENDARRAY = 7;
  int NULL = 8;
  int SLASHGT = 9;
  int GT = 10;
  int EQUALS = 11;
  int CLASS = 12;
  int LENGTH = 13;
  int VALUE = 14;
  int ID = 15;
  int HREF = 16;
  int LT = 17;
  int SPACE = 18;
  int STRING_LITERAL = 19;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\"<String\"",
    "\"<int\"",
    "\"<Handle\"",
    "\"<Object\"",
    "\"</Object>\"",
    "\"<Array\"",
    "\"</Array>\"",
    "\"<Null/>\"",
    "\"/>\"",
    "\">\"",
    "\"=\"",
    "\"class\"",
    "\"length\"",
    "\"value\"",
    "\"id\"",
    "\"href\"",
    "\"<\"",
    "<SPACE>",
    "<STRING_LITERAL>",
  };

}
