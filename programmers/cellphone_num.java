class Solution {
    public String solution(String phone_number) {
        int end = phone_number.length();
        String number = phone_number.substring(end-4,end);
        String star ="";
        for(int i = 0; i < end-4; i++)
        	star += "*";
        return star+number;
    }
}
