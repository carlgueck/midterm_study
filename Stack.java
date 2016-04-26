class Stack {
	private Object data[] = new Object [8];
	private int length;

	public push (Object input) {
		if (input != null) {
			if (length == data.length - 1) doubleInSize();
			data[length++] = input;
		}
	}

	public Object pop () {
		return data[--length];
	}

	public void doubleInSize() {
		Object temp = new Object [data.length * 2];
		for (int i = 0; i < length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}
}
