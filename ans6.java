class Solution {

    public int[] findOriginalArray(int[] array) {
		
		//EDGE CASE
        if (array == null) return new int[] {};
        int n = array.length;
        if (n == 0 || n % 2 != 0) return new int[] {};

        Arrays.sort(array);

        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //FREQUENCY
        for (int element : array) map.put(element, map.getOrDefault(element, 0) + 1);

		// HANDLING ZEROES(IMPORTANT EDGE CASES)
        int zeroes = 0;
        if (array[0] == 0){
            zeroes = map.get(0);
            if (zeroes % 2 != 0) return new int[]{};
        }

        if (zeroes == n) return new int[n / 2];
    
        for (int k = 0; k < zeroes/2;k++) l.add(0);

		// DEALING WITH REMAINING ELEMENTS(starting from the zeroes index because we have dealt with all the zeroes)
        for (int i = zeroes; i < array.length; i++) {
		//Check if we have current element and then check current element * 2 in our map.
            if (map.containsKey(array[i])) {
                int frequency = map.get(array[i]);
                map.remove(array[i]);
                if (!map.containsKey(array[i] * 2)) return new int[] {};

                l.add(array[i]);
                //NOW DEAL WITH DOUBLED ARRAY ELEMENT
                int frequencyOfDoubled = map.get(array[i] * 2);
                map.remove(array[i] * 2);

                if (frequency > 1) map.put(array[i], frequency - 1);
                if (frequencyOfDoubled > 1) map.put(array[i] * 2, frequencyOfDoubled - 1);
            }
        }


		//COPY FROM LIST TO ARRAY
        int[] result = new int[l.size()];
        for (int j = 0; j < l.size(); j++) result[j] = l.get(j);
        return result;
    }
}