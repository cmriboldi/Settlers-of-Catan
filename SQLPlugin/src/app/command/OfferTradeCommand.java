package app.command;


import app.communication.IJavaJSON;
import app.communication.OfferTradeJSON;
import app.exception.ServerException;
import app.model.CatanModel;
import app.model.resources.TradeOffer;
import app.server.AuthToken;
import app.server.IServerFacade;

public class OfferTradeCommand extends ICommand{


	private final IServerFacade facade;
	
	public OfferTradeCommand(AuthToken authToken, IJavaJSON jsonBody, IServerFacade facade)
	{
		super(authToken, jsonBody);
		this.facade = facade;
	}

	/**
	 * 
	 * Updates the CatanModel to reflect a players offered trade
	 * 
     * @return CatanModel, return the updated Catan model
     */
	@Override
	public Object execute() {
		CatanModel cm = null;
		try
		{
			cm = facade.getGameModel(authToken);
			
			TradeOffer tradeOffer = new TradeOffer(((OfferTradeJSON)body).getOffer(), ((OfferTradeJSON)body).getPlayerIndex(), ((OfferTradeJSON)body).getReceiver());
			
			cm.resourceManager.setTradeOffer(tradeOffer);
			
			cm.chatManager.logAction(cm.playerManager.getPlayerName(((OfferTradeJSON)body).getPlayerIndex()) + " offered a trade.", cm.playerManager.getPlayerName(((OfferTradeJSON)body).getPlayerIndex()));
			

			

			
		} catch (ServerException e)
		{
			e.printStackTrace();
		}
		return cm;
	}

}