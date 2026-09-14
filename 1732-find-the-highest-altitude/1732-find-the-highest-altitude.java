class Solution {
    public int largestAltitude(int[] gain) {
       int  largestAltitude=0;
        int altitude=0;
        
        for(int i=0;i<gain.length;i++)
        {
            altitude+=gain[i];
            largestAltitude=Math.max(largestAltitude,altitude);

        }
        return largestAltitude;

        
    }
}