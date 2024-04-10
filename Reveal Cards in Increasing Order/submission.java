class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] order = new int[deck.length];
        Queue<Integer> ordering = new LinkedList<>();

        for(int i=0; i<deck.length; i++){
            ordering.add(i);
        }

        Arrays.sort(deck);
        int i=0;

        while(!ordering.isEmpty() && i<deck.length){
            int indexRemoved = ordering.remove();
            System.out.println("index Removed: " + indexRemoved + " value: " + deck[i]);
            order[indexRemoved] = deck[i++];
            if(!ordering.isEmpty()){
                int indexAdded = ordering.remove();
                System.out.println("index Added: " + indexAdded);
                ordering.add(indexAdded);
            }
        }

        return order;
    }
}
