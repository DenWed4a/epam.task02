package by.epam.task02.entity;

public class Speakers implements Appliance{
	private final int powerConsumption;
	private final int numberOfSpeakers;
	private final String frequencyRange;
	private final double cordLength;

	private Speakers(Builder builder) {
		this.powerConsumption = builder.powerConsumption;
		this.numberOfSpeakers = builder.numberOfSpeakers;
		this.frequencyRange = builder.frequencyRange;
		this.cordLength = builder.cordLength;
	}

	public static class Builder {
		private int powerConsumption;
		private int numberOfSpeakers;
		private String frequencyRange;
		private double cordLength;

		public Builder powerConsumption(int powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public Builder numberOfSpeakers(int numberOfSpeakers) {
			this.numberOfSpeakers = numberOfSpeakers;
			return this;
		}

		public Builder frequencyRange(String frequencyRange) {
			this.frequencyRange = frequencyRange;
			return this;
		}

		public Builder cordLength(double cordLength) {
			this.cordLength = cordLength;
			return this;
		}

		public Speakers build() {
			return new Speakers(this);
		}

		public void clear() {
			this.powerConsumption = 0;
			this.numberOfSpeakers = 0;
			this.frequencyRange = null;
			this.cordLength = 0;
		}
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public double getCordLength() {
		return cordLength;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cordLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + numberOfSpeakers;
		result = prime * result + powerConsumption;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		if (Double.doubleToLongBits(cordLength) != Double.doubleToLongBits(other.cordLength))
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers != other.numberOfSpeakers)
			return false;
		if (powerConsumption != other.powerConsumption)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}

}
