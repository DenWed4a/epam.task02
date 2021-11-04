package by.epam.task02.entity;

public class TabletPC implements Appliance {
	
	private final int batteryCapacity;
	private final int displayInches;
	private final int memoryRom;
	private final int flashMemoryRom;
	private final String color;
	
	

	private TabletPC(Builder builder) {
		
		this.batteryCapacity = builder.batteryCapacity;
		this.displayInches = builder.displayInches;
		this.memoryRom = builder.memoryRom;
		this.flashMemoryRom = builder.flashMemoryRom;
		this.color = builder.color;
	}
	
	public static class Builder{
		
		private int batteryCapacity;
		private int displayInches;
		private int memoryRom;
		private int flashMemoryRom;
		private String color;
		
	
		
		public Builder batteryCapacity(int batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
			return this;
		}
		
		public Builder displayInches(int displayInches) {
			this.displayInches = displayInches;
			return this;
		}
		
		public Builder memoryRom(int memoryRom) {
			this.memoryRom = memoryRom;
			return this;
		}
		
		public Builder flashMemoryRom(int flashMemoryRom) {
			this.flashMemoryRom = flashMemoryRom;
			return this;
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
		}
		
		public TabletPC build() {
			return new TabletPC(this);
		}
		
	}



	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public int getDisplayInches() {
		return displayInches;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public int getFlashMemoryRom() {
		return flashMemoryRom;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batteryCapacity;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + displayInches;
		result = prime * result + flashMemoryRom;
		result = prime * result + memoryRom;
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches != other.displayInches)
			return false;
		if (flashMemoryRom != other.flashMemoryRom)
			return false;
		if (memoryRom != other.memoryRom)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches
				+ ", memoryRom=" + memoryRom + ", flashMemoryRom=" + flashMemoryRom + ", color=" + color + "]";
	}
	
	

	
	

}
