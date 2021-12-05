public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        int i=0;
        while(i<coords.length){
            StringBuilder sb=new StringBuilder(letters);
            int pos= coords[i];
            letters=(sb.deleteCharAt(pos)).toString();
            i++;

        }


        return letters;
    }
}

