package com.algorithm.programers32;

class Solution{
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for (int i = answer.length-1; i >=0 ; i--) {
        	
        	for (int j = i-1; j>=0; j--) {
        		System.out.println(heights[i] +" " + heights[j]);
				if(heights[i] < heights[j]) {
					answer[i] = j+1;
					break;
				}
			}
        	
			
		}
        
        for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
        
        return answer;
    }
}
