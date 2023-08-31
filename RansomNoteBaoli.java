public class RansomNoteBaoli {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < magazine.length(); i++) {
            for (int j = 0; j < ransomNote.length(); j++){
                if(magazine.charAt(i) == ransomNote.charAt(j)){//change int to string
                    ransomNote = ransomNote.substring(0, j) + ransomNote.substring(j + 1);
                    //(0, j)范围是(0, j-1), 后面+ (j+1), 由此把j删掉
                    break;
                }
            }
        }
        if(ransomNote.length() == 0){
            return true;//if there is no element in the ransomNote
        }
        return false;
    }
}
