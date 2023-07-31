package day3;

import java.util.Objects;

public class Bus {
		private int busId;
		private String busRoute;
		private float busFare;
		public Bus(int busId, String busRoute, float busFare) {
			super();
			this.busId = busId;
			this.busRoute = busRoute;
			this.busFare = busFare;
		}
		public int getBusId() {
			return busId;
		}
		public String getBusRoute() {
			return busRoute;
		}
		public float getBusFare() {
			return busFare;
		}
		@Override
		public String toString() {
			return " Bus info:"+
		            "\n Bus Id"+busId+
		            "\n Bus Route"+busRoute+
		            "\n Bus Fare"+busFare;
		}
		@Override
		public int hashCode() {
			return Objects.hash(busFare, busId, busRoute);
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Bus)
			{
				Bus b=(Bus)obj;
			    if(b.busId==this.busId && b.busFare==this.busFare && b.busRoute==this.busRoute)
			    	return true;
			    else
			    	return false;
			}
			else
				return false;
			
		}
		
		
}
