package com.lmhy;

/**
 * @author Forest
 * @date 2017/11/30 17:04
 * @note **
 */
public class LmhyHashMap {
    private static int len = 16;
    private LmhyEntry[] entries;
    private int index = 0;
    public LmhyHashMap(){
        super();
        initLen();
    }
    private void initLen(){
        entries = new LmhyEntry[len];
    }


    public void put(String key,String value){
        int keyHascode = key.hashCode() % len;
        LmhyEntry entry = entries[keyHascode];
        if(entry == null ){
            LmhyEntry en  = new LmhyEntry(key,value);
            entries[keyHascode] = en;
        }else{
            while(entry.entry !=null){
                if(entry.key.equals(key)){
                    entry.value = value;
                    return;
                }
                entry = entry.entry;
            }
            LmhyEntry oldEntry = new LmhyEntry(key,value);
            entry.entry = oldEntry;
        }


    }
    public String get(String key){
        int keyHashCode = key.hashCode() % len;
        LmhyEntry entry = entries[keyHashCode];
        while (entry!=null){
            if(entry.key.equals(key)){
                return entry.value;
            }
            entry = entry.entry;
        }
        return null;
    }

    private class LmhyEntry {
        private String key;
        private String value;
        private LmhyEntry entry;

        public LmhyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public LmhyEntry(String key, String value, LmhyEntry entry) {
            this.key = key;
            this.value = value;
            this.entry = entry;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public LmhyEntry getEntry() {
            return entry;
        }

        public void setEntry(LmhyEntry entry) {
            this.entry = entry;
        }
    }
}
