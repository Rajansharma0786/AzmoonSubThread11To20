package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.Entity.TblSubscription;
import com.Repository.TblBillingRepo;
import com.Repository.TblSubscriptionRepository;
import com.Service.SubscriptionService;

//@RestController
@Component
public class SubcriptionController {

	@Autowired
	TblSubscriptionRepository subscriptionRepository;

	@Autowired
	SubscriptionService service;

	@Autowired
	TblBillingRepo billingRepo;

	private final String hour1 = "3";
	private final String hour2="4";
	private final String hour3="11";
	private final String hour5="12";
	private final String hour6="18";
	private final String hour4="17";
	
	
	@Scheduled(cron = "0 55 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 55 "+hour3+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 55 "+hour4+" * * *", zone = "Asia/Kolkata")

	public void getTypeRenForThread11() {

			try {
				String status="11";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
//	
	@Scheduled(cron = "0 56 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 56 "+hour3+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 56 "+hour4+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread12() {

			try {
				String status="12";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
//	

	@Scheduled(cron = "0 57 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 57 "+hour3+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 57 "+hour4+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread13() {

			try {
				String status="13";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
//	
//	
	@Scheduled(cron = "0 58 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 58 "+hour3+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 58 "+hour4+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread14() {

			try {
				String status="14";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 59 "+hour1+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 59 "+hour3+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 59 "+hour4+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread15() {

			try {
				String status="15";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 0 "+hour2+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 0 "+hour5+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 0 "+hour6+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread16() {

			try {
				String status="16";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 1 "+hour2+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 1 "+hour5+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 1 "+hour6+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread17() {

			try {
				String status="17";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
//	
	@Scheduled(cron = "0 2 "+hour2+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 2 "+hour5+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 2 "+hour6+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread18() {

			try {
				String status="18";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
	@Scheduled(cron = "0 3 "+hour2+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 3 "+hour5+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 3 "+hour6+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread19() {

			try {
				String status="19";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
	
//	
	@Scheduled(cron = "0 4 "+hour2+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 4 "+hour5+" * * *", zone = "Asia/Kolkata")
	@Scheduled(cron = "0 4 "+hour6+" * * *", zone = "Asia/Kolkata")
	public void getTypeRenForThread20() {

			try {
				String status="20";
				System.out.println("Control Inside Subscription");
				List<TblSubscription> subscription = subscriptionRepository.getForREN(status);
//					System.out.println("value of subscription is"+subscription);
				if (subscription.size() != 0) {
//						System.out.println("Control inside if");
					service.saveRenTypeInBilling(subscription);
				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Exception in Subscription Controller" + e.getMessage());
			}

		}
}
