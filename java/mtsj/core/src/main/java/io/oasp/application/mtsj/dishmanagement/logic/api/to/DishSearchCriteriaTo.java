package io.oasp.application.mtsj.dishmanagement.logic.api.to;

import java.math.BigDecimal;
import java.util.Collection;

import io.oasp.application.mtsj.dishmanagement.dataaccess.api.Category;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link io.oasp.application.mtsj.dishmanagement.common.api.Dish}s.
 */
public class DishSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Collection<Category> categories;

  private BigDecimal maxPrice;

  private int minLikes;

  private String searchBy;

  private int showOrder;

  private boolean isFav;

  /**
   * @return categories
   */
  public Collection<Category> getCategories() {

    return this.categories;
  }

  /**
   * @param categories new value of {@link #getcategories}.
   */
  public void setCategories(Collection<Category> categories) {

    this.categories = categories;
  }

  /**
   * @return maxPrice
   */
  public BigDecimal getMaxPrice() {

    return this.maxPrice;
  }

  /**
   * @param maxPrice new value of {@link #getmaxPrice}.
   */
  public void setMaxPrice(BigDecimal maxPrice) {

    this.maxPrice = maxPrice;
  }

  /**
   * @return minLikes
   */
  public int getMinLikes() {

    return this.minLikes;
  }

  /**
   * @param minLikes new value of {@link #getminLikes}.
   */
  public void setMinLikes(int minLikes) {

    this.minLikes = minLikes;
  }

  /**
   * @return searchBy
   */
  public String getSearchBy() {

    return this.searchBy;
  }

  /**
   * @param searchBy new value of {@link #getsearchBy}.
   */
  public void setSearchBy(String searchBy) {

    this.searchBy = searchBy;
  }

  /**
   * @return showOrder
   */
  public int getShowOrder() {

    return this.showOrder;
  }

  /**
   * @param showOrder new value of {@link #getshowOrder}.
   */
  public void setShowOrder(int showOrder) {

    this.showOrder = showOrder;
  }

  /**
   * @return isFav
   */
  public boolean isFav() {

    return this.isFav;
  }

  /**
   * @param isFav new value of {@link #getisFav}.
   */
  public void setFav(boolean isFav) {

    this.isFav = isFav;
  }

  /**
   * The constructor.
   */
  public DishSearchCriteriaTo() {

    super();
  }

}
