class Solution {

    private String transformString(String s){
        HashMap<Character, Integer> index = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(!index.containsKey(c)){
                index.put(c,i);
            }
            sb.append(Integer.toString(index.get(c)));
            sb.append(" ");
        }
        System.out.println("From String");
        System.out.println(sb.toString());
        return sb.toString();
    }

    private String transformStringPattern(String pattern){
        HashMap<String, Integer> index = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] words = pattern.split(" ");

        for(int i=0; i<words.length; i++){
            String word = words[i];
            if(!index.containsKey(word)){
                index.put(word, i);
            }

            sb.append(Integer.toString(index.get(word)));
            sb.append(" ");
        }
        System.out.println("From String Pattern");
        System.out.println(sb.toString());
        return sb.toString();
    }


    public boolean wordPattern(String pattern, String s) {
        return transformString(pattern).equals(transformStringPattern(s));
    }
}
