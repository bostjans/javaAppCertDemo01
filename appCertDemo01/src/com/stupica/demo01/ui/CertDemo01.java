package com.stupica.demo01.ui;


import java.util.logging.Logger;


/**
 * Created by bostjans on 21/06/15.
 */
public class CertDemo01 {

   private final static Logger logger = Logger.getLogger(CertDemo01.class.getName());


//   /*
//    * Complete the function below.
//    */
//   static String FizzBuzz(int untilVal) {
//      //int iCount = 1;
//      String sLine = Integer.toString(untilVal);
//      boolean isMod3 = false;
//      StringBuilder sResult = new StringBuilder();
//
//      for (int iCount = 1; iCount <= untilVal; iCount++) {
//         isMod3 = false;
//         sLine = Integer.toString(iCount);
//         if ((iCount % 3) == 0) {
//            sLine = "Fizz";
//            isMod3 = true;
//         }
//         if ((iCount % 5) == 0) {
//            if (isMod3) sLine += "Buzz";
//            else sLine = "Buzz";
//         }
//         sResult.append(sLine);
//         sResult.append("\n");
//      }
//      return sResult.toString();
//   }


   public static void main(String[] args) {
      logger.info("main(): Start ..");
      System.out.println("Hello, World");
      //TestFoo objF = new TestFoo();
      //objF.foo();
   }

//   public static void main(String[] args) throws IOException{
//      Scanner in = new Scanner(System.in);
//      //final String fileName = System.getenv("OUTPUT_PATH");
//      final String fileName = "test11.txt";
//      BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//      String res;
//      int _untilVal;
//      _untilVal = Integer.parseInt(in.nextLine().trim());
//
//      res = FizzBuzz(_untilVal);
//      bw.write(res);
//      bw.newLine();
//
//      bw.close();
//   }


//   static String createPath(String[] pathSegments) {
//      // You should replace or update the below
//      return '/' + Arrays.asList(pathSegments).stream().collect(Collectors.joining("/"));
//   }
//
//   public static void main(String[] args) throws IOException{
//      Scanner in = new Scanner(System.in);
//      final String fileName = System.getenv("OUTPUT_PATH");
//      BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//      String res;
//
//      int _pathSegments_size = 0;
//      _pathSegments_size = Integer.parseInt(in.nextLine().trim());
//      String[] _pathSegments = new String[_pathSegments_size];
//      String _pathSegments_item;
//      for(int _pathSegments_i = 0; _pathSegments_i < _pathSegments_size; _pathSegments_i++) {
//         try {
//            _pathSegments_item = in.nextLine();
//         } catch (Exception e) {
//            _pathSegments_item = null;
//         }
//         _pathSegments[_pathSegments_i] = _pathSegments_item;
//      }
//
//      res = createPath(_pathSegments);
//      bw.write(res);
//      bw.newLine();
//
//      bw.close();
//   }


//   static String[] JudgeSort(String judgesInput) {
//      List<int> arrVal = new ArrayList<int>();
//      String[] arrResult = null;
//
//      String[] arrStrIn = judgesInput.split(",");
//      if (arrStrIn != null) {
//         for (String sLoop : arrStrIn) {
//            boolean bValueDecrypt = false;
//            int iVal = 0;
//
//            try {
//               iVal = Integer.parseInt(sLoop);
//               bValueDecrypt = true;
//            } catch (Exception ex) {
//               iVal = -100;
//            }
//            if (bValueDecrypt) {
//               arrVal.add(iVal);
//               continue;
//            }
//            // ..
//         }
//      }
//      //arrVal.
//
//      return arrResult;
//   }
//
//   public static void main(String[] args) throws IOException{
//      Scanner in = new Scanner(System.in);
//      final String fileName = System.getenv("OUTPUT_PATH");
//      BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//      String[] res;
//      String _judgesInput;
//      try {
//         _judgesInput = in.nextLine();
//      } catch (Exception e) {
//         _judgesInput = null;
//      }
//
//      res = JudgeSort(_judgesInput);
//      for(int res_i=0; res_i < res.length; res_i++) {
//         bw.write(String.valueOf(res[res_i]));
//         bw.newLine();
//      }
//
//      bw.close();
//   }
}
