class Logger {
    private HashMap<String, Integer> expiry;
    private int TIMEOUT = 10; 
    public Logger() {
     expiry = new HashMap<String, Integer>();   
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(expiry.containsKey(message) && expiry.get(message) > timestamp){
            return false;
        }
        expiry.put(message, timestamp+TIMEOUT);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
