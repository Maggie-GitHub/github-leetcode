public class RansomNoteBaoli {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < magazine.length(); i++) {
            for (int j = 0; j < ransomNote.length(); j++){
                if(magazine.charAt(i) == ransomNote.charAt(j)){
                    ransomNote = ransomNote.substring(0, j) + ransomNote.substring(j + 1);
                    break;
                }
            }
        }
        if(ransomNote.length() == 0){
            return true;
        }
        return false;
    }
}
