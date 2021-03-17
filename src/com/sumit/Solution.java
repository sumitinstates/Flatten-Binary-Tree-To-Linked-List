package com.sumit;

public class Solution {
	
	public void flatten(TreeNode root) 
    {
        
           if(root==null)
           {
              return;
           }
         
           //store right node in temp variable
            TreeNode rightTemp = root.right;
            
            //calling recursive method to flatten left node
            flatten(root.left);
            
            //assigning left root value to right root according to question rquirements.
            root.right = root.left;
            
            //assigning left rool value as null according to question requirements
            root.left = null;
            
            //moving furthest in rigth side of node
            while(root.right!=null)
            {
                root = root.right;
            }
            
            // flatten the right node stored in temp
            flatten(rightTemp);
            
            //adding the right temp to remaining node.
            root.right = rightTemp;   
          
    }

}
