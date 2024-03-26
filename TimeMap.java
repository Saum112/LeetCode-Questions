class TimeMap {

    Map<String, List<Data>> map;

    public TimeMap() {

        map = new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(map.containsKey(key)){

            map.get(key).add(new Data(value, timestamp));
        }

        else{

            ArrayList<Data> arr = new ArrayList<>();
            arr.add(new Data(value, timestamp));
            map.put(key, arr);

        }
    }
    
    public String get(String key, int timestamp) {
        
        String result = "";

        if(map.containsKey(key)){

            List<Data> arr = map.get(key);
            int low = 0, high = arr.size()-1;

            while(low <= high){

                int mid = low + (high - low)/2;

                int time = arr.get(mid).timeStamp;

                if(time <= timestamp){
                    result = arr.get(mid).val;
                    low = mid + 1;
                }

                else{

                    high = mid - 1;
                }

            }
        }

        return result;
    }
}

class Data{

    String val;
    int timeStamp;

    public Data(String val, int timeStamp){

        this.val = val;
        this.timeStamp = timeStamp;
    }

}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
