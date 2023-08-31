public class RansomNoteSet {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] record = new int[26];//totally 26 characters

        for(char m : magazine.toCharArray()){
            record[m - 'a'] += 1;//见mag里的就加1
        }
        for(char r : ransomNote.toCharArray()){
            record[r - 'a'] -= 1;//见ran里的就减1
        }

        for(int i : record){
            if(i < 0){
                return false;
            }
        }
        return true;
    }
}
