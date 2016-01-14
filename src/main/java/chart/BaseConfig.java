package chart;

/**
 * Global chart configuration
 */
abstract class BaseConfig {

	public int width = 500;

	public int height = 500;

	/**
	 * Whether to animate the chart
	 */
	public boolean animation = true;

	/**
	 * Number of animation steps
	 */
	public int animationSteps = 60;

	/**
	 * Animation easing effect
	 * Possible effects are:
	 * [easeInOutQuart, linear, easeOutBounce, easeInBack, easeInOutQuad,
	 * easeOutQuart, easeOutQuad, easeInOutBounce, easeOutSine, easeInOutCubic,
	 * easeInExpo, easeInOutBack, easeInCirc, easeInOutElastic, easeOutBack,
	 * easeInQuad, easeInOutExpo, easeInQuart, easeOutQuint, easeInOutCirc,
	 * easeInSine, easeOutExpo, easeOutCirc, easeOutCubic, easeInQuint,
	 * easeInElastic, easeInOutSine, easeInOutQuint, easeInBounce,
	 * easeOutElastic, easeInCubic]
	 */
	public String animationEasing = "easeOutQuart";

	/**
	 * If we should show the scale at all
	 */
	public boolean showScale = true;

	/**
	 * If we want to override with a hard coded scale
	 */
	public boolean scaleOverride = false;

	/**
	 * Required if scaleOverride is true
	 * The number of steps in a hard coded scale
	 */
	public Integer scaleSteps;

	/**
	 * The value jump in the hard coded scale
	 */
	public Integer scaleStepWidth;

	/**
	 * The scale starting value
	 */
	public Integer scaleStartValue;

	/**
	 * Colour of the scale line
	 */
	public String scaleLineColor = "rgba(0,0,0,.1)";

	/**
	 * Pixel width of the scale line
	 */
	public int scaleLineWidth = 1;

	/**
	 * Whether to show labels on the scale
	 */
	public boolean scaleShowLabels = true;

	/**
	 * Interpolated JS string - can access value
	 */
	public String scaleLabel = "<%=value%>";

	/**
	 * Whether the scale should stick to integers, not floats even if drawing
	 * space is there
	 */
	public boolean scaleIntegersOnly = true;

	/**
	 * Whether the scale should start at zero, or an order of magnitude down
	 * from the lowest value
	 */
	public boolean scaleBeginAtZero = false;

	/**
	 * Scale label font declaration for the scale label
	 */
	public String scaleFontFamily = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif";

	/**
	 * Scale label font size in pixels
	 */
	public int scaleFontSize = 12;

	/**
	 * Scale label font weight style
	 */
	public String scaleFontStyle = "normal";

	/**
	 * Scale label font colour
	 */
	public String scaleFontColor = "#666";

	/**
	 * whether or not the chart should be responsive and resize when the browser does.
	 */
	public boolean responsive = false;

	/**
	 * whether to maintain the starting aspect ratio or not when responsive,
	 * if set to false, will take up entire container
	 */
	public boolean maintainAspectRatio = true;

	/**
	 * Determines whether to draw tooltips on the canvas or not
	 */
	public boolean showTooltips = true;

	// Function - Determines whether to execute the customTooltips function instead
	// of drawing the built in tooltips (See [Advanced - External Tooltips](#advanced-usage-custom-tooltips))  */
	public boolean customTooltips = false;

	// Array - Array of string names to attach tooltip events   */
	public String[] tooltipEvents = {"mousemove", "touchstart", "touchmove"};

	/**
	 * Tooltip background colour
	 */
	public String tooltipFillColor = "rgba(0,0,0,0.8)";

	/**
	 * Tooltip label font declaration for the scale label
	 */
	public String tooltipFontFamily = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif";

	/**
	 * Tooltip label font size in pixels
	 */
	public int tooltipFontSize = 14;

	/**
	 * Tooltip font weight style
	 */
	public String tooltipFontStyle = "normal";

	/**
	 * Tooltip label font colour
	 */
	public String tooltipFontColor = "#fff";

	/**
	 * Tooltip title font declaration for the scale label
	 */
	public String tooltipTitleFontFamily = "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif";

	/**
	 * Tooltip title font size in pixels
	 */
	public int tooltipTitleFontSize = 14;

	/**
	 * Tooltip title font weight style
	 */
	public String tooltipTitleFontStyle = "bold";

	/**
	 * Tooltip title font colour
	 */
	public String tooltipTitleFontColor = "#fff";

	/**
	 * pixel width of padding around tooltip text
	 */
	public int tooltipYPadding = 6;

	/**
	 * pixel width of padding around tooltip text
	 */
	public int tooltipXPadding = 6;

	/**
	 * Size of the caret on the tooltip
	 */
	public int tooltipCaretSize = 8;

	/**
	 * Pixel radius of the tooltip border
	 */
	public int tooltipCornerRadius = 6;

	/**
	 * Pixel offset from point x to tooltip edge
	 */
	public int tooltipXOffset = 10;

	/**
	 * Template string for single tooltips
	 */
	public String tooltipTemplate = "<%if (label){%><%=label%>: <%}%><%= value %>";

	/**
	 * Template string for multiple tooltips
	 */
	public String multiTooltipTemplate = "<%= value %>";

}
