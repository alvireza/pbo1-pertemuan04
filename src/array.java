public class array {
        public static void main(String[] args){
            String[][] nama = {{"ALFI ", "4D", "19630984"}, {"TOMO ", "4D", "18630983"},
                    {"TEGAR", "4D", "18630982"}};
            for(int i=0; i<3; i++) {
                for (int j = 0; j < 3; ) {
                    System.out.print
                            (nama[i][j++] + " | " + nama[i][j++] + " | " + nama[i][j++] + "\n");
                }
            }
        }

}
