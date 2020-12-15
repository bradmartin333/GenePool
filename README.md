# GenePool

RSM 521 Final Project
GenePool

How To Run GenePool
	Import folder into Eclipse.
	Set up windows so that you have a large, horizontal console.
	Run Prompt.java for the full effect. Follow the on-screen directions. 
	
	Note: when D class genes are entered, .png files have to be loaded, so it may take a while until the image is displayed.

Origins of the Project
	A mutation can be either a flip or invert. It starts with this code:

	 1 2 3 4
	 A B C D	where A + C is like 1 + 3 and 1 + 4 = the remainder after dividing by 4

	Starting with 4 random combinations:	       A3 B4 D1 C2
	We can either flip or invert first:    flip: C2 D1 B4 A3
						                              sum: D1 B1 B1 D1
					                             invert: B1 D1 D1 B1
					                                sum: B2 B2 B2 B2 and B2 is the solved gene

	Sometimes, the gene solves on the first try: C3 B1 A4 D2     
					                               flip: D2 A4 B1 C3
						                              sum: C1 C1 C1 C1 and C1* is the solved gene
	
	So, I thought, what if a 1-solve gene acted like a dominant gene.
	The grandparents are given 4 sets of 4 genes which are then solved for, sometimes giving 1-solve genes to the grandparents.
	The parents are then given any 1-solve genes as then randomly given genes from the grandparents. The children work in the same way.

IV. Design Decisions & Project Issues
	This project uses a ton of for loops where case switch should have been used.
	Some methods could have been defined and called with different parameters instead of copying the same method four times.
	I used JFrame due to its ease of implementation. Mason did not seem necessary.
	The largest issue is the incorporation of asterisks with formatting. I ignored them.
	So when the program generates grandparents with a lot of 1-solve genes, the formatting tends to get screwed up.
  For the most part, it works, so I didn't bother fixing this as it did not seem worth the time.
	I tried to give a brief explanation of each class file in the header, so I won't delve into it here.
	While 1-solve genes cannot be given more than once, non 1-solve genes can.
  I did not fix this as I would have to then treat each gene as a separate entity and my jumbles of arrays would no longer be sufficient.
	I thought about having a Continue? type of line at the end that would repeat the input and display.
  Then I figured it's more fun to just get an entirely new tree.
  Also, if you can decipher Display.java and figure out the code, you can just input whatever you want to see anyway.

V. Conclusion
	This was a really cool class, and although I don't really understand how to use Mason, I learned a lot about program structure and it took my capabilities to the next level.
  I know it's messy, but I am proud of this project.
