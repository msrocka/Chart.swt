package chart;

public class BarConfig extends BaseConfig {

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
	 * If there is a stroke on each bar
	 */
	public boolean barShowStroke = true;

	/**
	 * Pixel width of the bar stroke
	 */
	public int barStrokeWidth = 2;

	/**
	 * Spacing between each of the X value sets
	 */
	public int barValueSpacing = 5;

	/**
	 * Spacing between data sets within X values
	 */
	public int barDatasetSpacing = 1;

	/**
	 * A legend template
	 */
	public String legendTemplate = "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].fillColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>";


}
