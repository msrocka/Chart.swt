package chart;

public class RadarConfig extends BaseConfig {
	/**
	 * Whether to show lines for each scale point
	 */
	public boolean scaleShowLine = true;

	/**
	 * Whether we show the angle lines out of the radar
	 */
	public boolean angleShowLineOut = true;

	/**
	 * Colour of the angle line
	 */
	public String angleLineColor = "rgba(0,0,0,.1)";

	/**
	 * Pixel width of the angle line
	 */
	public int angleLineWidth = 1;

	/**
	 * Point label font declaration
	 */
	public String pointLabelFontFamily = "'Arial'";

	/**
	 * Point label font weight
	 */
	public String pointLabelFontStyle = "normal";

	/**
	 * Point label font size in pixels
	 */
	public int pointLabelFontSize = 10;

	/**
	 * Point label font colour
	 */
	public String pointLabelFontColor = "#666";

	/**
	 * Whether to show a dot for each point
	 */
	public boolean pointDot = true;

	/**
	 * Radius of each point dot in pixels
	 */
	public int pointDotRadius = 3;

	/**
	 * Pixel width of point dot stroke
	 */
	public int pointDotStrokeWidth = 1;

	/**
	 * amount extra to add to the radius to cater for hit detection outside the drawn point
	 */
	public int pointHitDetectionRadius = 20;

	/**
	 * Whether to show a stroke for datasets
	 */
	public boolean datasetStroke = true;

	/**
	 * Pixel width of dataset stroke
	 */
	public int datasetStrokeWidth = 2;

	/**
	 * Whether to fill the dataset with a colour
	 */
	public boolean datasetFill = true;

	/**
	 * A legend template
	 */
	public String legendTemplate = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].strokeColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>";
}
