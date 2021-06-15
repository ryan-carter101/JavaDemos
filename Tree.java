public class Tree<T>{ //class to prototype a tree. Kinda pointless, beyond just showing off cuz I can.
	private Tree left, right;
	private T value = null;
	public Tree(T in){
		left = right = null;
		value = in;		
	}
	public Tree getLeft(){
		return left;
	}
	public Tree getRight(){
		return right;
	}
	public void setLeft(Tree l){
		left = l;
	}
	public void setRight(Tree r){
		right = r;
	}
	public T getval(){
		return value;
	}
}