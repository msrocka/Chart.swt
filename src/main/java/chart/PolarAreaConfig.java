package chart;

public class PolarAreaConfig extends BaseConfig {

	/**
	 * Show a backdrop to the scale label
	 */
	public boolean scaleShowLabelBackdrop = true;

	/**
	 * The colour of the label backdrop
	 */
	public String scaleBackdropColor = "rgba(255,255,255,0.75)";

	/**
	 * The backdrop padding above & below the label in pixels
	 */
	public int scaleBackdropPaddingY = 2;

	/**
	 * The backdrop padding to the side of the label in pixels
	 */
	public int scaleBackdropPaddingX = 2;

	/**
	 * Show line for each value in the scale
	 */
	public boolean scaleShowLine = true;

	/**
	 * Stroke a line around each segment in the chart
	 */
	public boolean segmentShowStroke = true;

	/**
	 * The colour of the stroke on each segment.
	 */
	public String segmentStrokeColor = "#fff";

	/**
	 * The width of the stroke value in pixels
	 */
	public int segmentStrokeWidth = 2;

	/**
	 * Whether to animate the rotation of the chart
	 */
	public boolean animateRotate = true;

	/**
	 * Whether to animate scaling the chart from the centre
	 */
	public boolean animateScale = false;

	/**
	 * A legend template
	 */
	public String legendTemplate = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>";


}
