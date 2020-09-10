//import javax.script.ScriptEngine;
//import javax.script.ScriptEngineManager;
//import javax.script.ScriptException;
//
//public class Laba61 {
//
//	    public boolean canBeEqualTo24(int[] nums) throws ScriptException {
//	        ScriptEngineManager manager = new ScriptEngineManager();
//	        ScriptEngine engine = manager.getEngineByName("js");
//	 
//	        final int NUMBER_N = 24;
//	        int number1, number2, number3, number4;
//	 
//	        char operator1, operator2, operator3;
//	 
//	        int[] arrNums = nums;
//	 
//	        char[] arrChs = new char[4];
//	        arrChs[0] = '*';
//	        arrChs[1] = '/';
//	        arrChs[2] = '+';
//	        arrChs[3] = '-';
//	 
//	        String[] arrStr = new String[7];
//	        for (int i = 0; i < 7; i++) {
//	            arrStr[i] = "";
//	            }
//	        
//	        String explanation = "Пояснение: из данного набора чисел невозможно составить выражение, равное 24.";
//	        boolean isEqualTo24 = false;
//	        Object result = engine.eval("0");
//	 
//	        for (int i = 0; i < 4 && !isEqualTo24; i++) {
//	            number1 = arrNums[i];
//	            for (int j = 0; j < 4 && !isEqualTo24; j++) {
//	                if (j != i) {
//	                    number2 = arrNums[j];
//	                    for (int k = 0; k < 4 && !isEqualTo24; k++) {
//	                        if (k != i && k != j) {
//	                            number3 = arrNums[k];
//	                            for (int l = 0; l < 4 && !isEqualTo24; l++) {
//	                                if (l != i && l != j && l != k) {
//	                                    number4 = arrNums[l];
//	                                    
//	                                    for (int m = 0; m < 4 && !isEqualTo24; m++) {
//	                                        operator1 = arrChs[m];
//	                                        for (int n = 0; n < 4 && !isEqualTo24; n++) {
//	                                            operator2 = arrChs[n];
//	                                            for (int o = 0; o < 4 && !isEqualTo24; o++) {
//	                                                operator3 = arrChs[o];
//	                                                
//	                                                arrStr[0] = "" + number1 + operator1 + number2 + operator2 + number3 + operator3 + number4;
//	                                                arrStr[1] = "(" + number1 + operator1 + number2 + ")" + operator2 + number3 + operator3 + number4;
//	                                                arrStr[2] = "(" + number1 + operator1 + number2 + operator2 + number3 + ")" + operator3 + number4;
//	                                                arrStr[3] = "" + number1 + operator1 + "(" + number2 + operator2 + number3 + ")" + operator3 + number4;
//	                                                arrStr[4] = "" + number1 + operator1 + "(" + number2 + operator2 + number3 + operator3 + number4 + ")";
//	                                                arrStr[5] = "" + number1 + operator1 + number2 + operator2 + "(" + number3 + operator3 + number4 + ")";
//	                                                arrStr[6] = "(" + number1 + operator1 + number2 + ")" + operator2 + "(" + number3 + operator3 + number4 + ")";
//	 
//	                                                for (int p = 0; p < 7; p++) {
//	                                                    result = engine.eval(arrStr[p]);
//	                                                    if (result.equals(NUMBER_N)) {
//	                                                        explanation = "Пояснение: " + arrStr[p] + "=24";
//	                                                        isEqualTo24 = true;
//	                                                        break;
//	                                                        }
//	                                                    }
//	                                                }
//	                                            }
//	                                        }
//	                                    }
//	                                }
//	                            }
//	                        }
//	                    }
//	                }
//	            }
//	        System.out.println(explanation);
//	        return isEqualTo24;
//	        }
//
//}
