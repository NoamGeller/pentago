
public class AgentFactory {

	final static int HUMAN = 0;
	/** 
	 * @param name AlphaBeta or Brain, for now
	 * @param details depth (0 for human), color (-1 or 1), etc.
	 * @return The requested Agent, or null for human.
	 */
	public static Agent getAgent(String agentType, int[] details)
	{
		if (agentType.equals("Human"))
		{
			return null;
		}
		if (agentType.equals("AlphaBeta (BasicEval)")) //alpha beta basic
		{
			return new AlphaBetaAgent(details[0], details[1], new BasicEval());
		}
		if (agentType.equals("AlphaBeta (EdgeEval)")) //alpha beta edge
		{
			return new AlphaBetaAgent(details[0], details[1], new EdgeEval());
		}
		if (agentType.equals("Brain")) //brain
		{
			return new BrainAgent(details[1], details[0], details[2]);
		}
		return null;
	}
}