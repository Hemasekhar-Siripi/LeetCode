class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m1 = new HashMap<>();
        m1.put('I',1);
        m1.put('V',5);
        m1.put('X',10);   
        m1.put('L',50);
        m1.put('C',100);
        m1.put('D',500); 
        m1.put('M',1000);  
        int total =0;
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1 && m1.get(s.charAt(i))<m1.get(s.charAt(i+1))){
                total=total-m1.get(s.charAt(i));
            }else{
                total=total+m1.get(s.charAt(i));
            }
        }      
        return total;
    }
}