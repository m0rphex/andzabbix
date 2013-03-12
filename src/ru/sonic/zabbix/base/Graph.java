package ru.sonic.zabbix.base;

import java.util.Map;

public class Graph extends ZabbixObject {
	
	private static final long serialVersionUID = -2509426357357759912L;

	public Graph(Map<?, ?> m){
		super(m);
	}
	
	public String getName(){
		return (String)get("name");
	}
	
	public Boolean getShowTriggers(){
		return (Boolean)get("show_triggers");
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	public String getID(){
		return (String)get("graphid");
	}
	
	public String getwidth(){
		return (String)get("width");
	}
	
	public String getheight(){
		return (String)get("height");
	}
	
	public String getyaxismin(){
		return (String)get("yaxismin");
	}
	
	public String getyaxismax(){
		return (String)get("yaxismax");
	}
	
	/*
	 * Normal
	 * Stacked
	 * Pie
	 * Eploded
	 */
	public String getgraphtype(){
		return (String)get("graphtype");
	}
	
	public String getpercent_left(){
		return (String)get("percent_left");
	}
	
	public String getpercent_right(){
		return (String)get("percent_right");
	}
	
	public String getshow_legend(){
		return (String)get("show_legend");
	}
	
}