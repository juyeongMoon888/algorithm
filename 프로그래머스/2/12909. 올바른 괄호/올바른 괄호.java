class Solution {
    boolean solution(String s) {
        int cnt = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i); // String -> char 변환 
            if (x == '(') { 
                cnt++; //return하면 안됌! //0//0
            } else {
                if (cnt == 0) {
                    return false;
                }
                cnt--;
            }
        }
        return cnt == 0;
    }
}