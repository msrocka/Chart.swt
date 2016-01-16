package chart;

public class PieConfig extends BaseConfig {

	/**
	 * Whether we should show a stroke on each segment
	 */
	public boolean segmentShowStroke = true;

	/**
	 * The colour of each segment stroke
	 */
	public String segmentStrokeColor = "#fff";

	/**
	 * The width of each segment stroke
	 */
	public int segmentStrokeWidth = 2;

	/**
	 * The percentage of the chart that we cut out of the middle
	 */
	public int percentageInnerCutout = 0; // This is 0 for Pie charts

	/**
	 * Whether we animate the rotation of the Doughnut
	 */
	public boolean animateRotate = true;

	/**
	 * Whether we animate scaling the Doughnut from the centre
	 */
	public boolean animateScale = false;

	/**
	 * A legend template
	 */
	public String legendTemplate = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>";

	public PieConfig() {
		animationSteps = 100;
		animationEasing = "easeOutBounce";
	}
}
