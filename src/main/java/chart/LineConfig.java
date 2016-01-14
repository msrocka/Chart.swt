package chart;

public class LineConfig extends BaseConfig {

	/**
	 * Whether grid lines are shown across the chart
	 */
	public boolean scaleShowGridLines = true;

	/**
	 * Colour of the grid lines
	 */
	public String scaleGridLineColor = "rgba(0,0,0,.05)";

	/**
	 * Width of the grid lines
	 */
	public int scaleGridLineWidth = 1;

	/**
	 * Whether to show horizontal lines (except X axis)
	 */
	public boolean scaleShowHorizontalLines = true;

	/**
	 * Whether to show vertical lines (except Y axis)
	 */
	public boolean scaleShowVerticalLines = true;

	/**
	 * Whether the line is curved between points
	 */
	public boolean bezierCurve = true;

	/**
	 * Tension of the bezier curve between points
	 */
	public double bezierCurveTension = 0.4;

	/**
	 * Whether to show a dot for each point
	 */
	public boolean pointDot = true;

	/**
	 * Radius of each point dot in pixels
	 */
	public int pointDotRadius = 4;

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
