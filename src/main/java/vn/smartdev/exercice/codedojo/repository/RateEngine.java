package vn.smartdev.exercice.codedojo.repository;

class RateEngine {
	private float sizeFrom = 0f;
	private float sizeTo = 0f;
	private float rate;

	RateEngine(float sizeFrom, float sizeTo, float rate) {
		this.sizeFrom = sizeFrom;
		this.sizeTo = sizeTo;
		this.rate = rate;
	}

	public float getSizeFrom() {
		return sizeFrom;
	}

	public float getSizeTo() {
		return sizeTo;
	}

	public float getRate() {
		return rate;
	}

}
