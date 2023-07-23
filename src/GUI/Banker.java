/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jbodo
 */
@Entity
@Table(name = "banker", catalog = "banksystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Banker.findAll", query = "SELECT b FROM Banker b"),
    @NamedQuery(name = "Banker.findByBankerName", query = "SELECT b FROM Banker b WHERE b.bankerName = :bankerName"),
    @NamedQuery(name = "Banker.findByBankerPassword", query = "SELECT b FROM Banker b WHERE b.bankerPassword = :bankerPassword"),
    @NamedQuery(name = "Banker.findByAccountBalance", query = "SELECT b FROM Banker b WHERE b.accountBalance = :accountBalance"),
    @NamedQuery(name = "Banker.findByBankerNum", query = "SELECT b FROM Banker b WHERE b.bankerNum = :bankerNum")})
public class Banker implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Banker_Name")
    private String bankerName;
    @Basic(optional = false)
    @Column(name = "Banker_Password")
    private int bankerPassword;
    @Basic(optional = false)
    @Column(name = "Account_Balance")
    private int accountBalance;
    @Id
    @Basic(optional = false)
    @Column(name = "Banker_Num")
    private Integer bankerNum;

    public Banker() {
    }

    public Banker(Integer bankerNum) {
        this.bankerNum = bankerNum;
    }

    public Banker(Integer bankerNum, String bankerName, int bankerPassword, int accountBalance) {
        this.bankerNum = bankerNum;
        this.bankerName = bankerName;
        this.bankerPassword = bankerPassword;
        this.accountBalance = accountBalance;
    }

    public String getBankerName() {
        return bankerName;
    }

    public void setBankerName(String bankerName) {
        String oldBankerName = this.bankerName;
        this.bankerName = bankerName;
        changeSupport.firePropertyChange("bankerName", oldBankerName, bankerName);
    }

    public int getBankerPassword() {
        return bankerPassword;
    }

    public void setBankerPassword(int bankerPassword) {
        int oldBankerPassword = this.bankerPassword;
        this.bankerPassword = bankerPassword;
        changeSupport.firePropertyChange("bankerPassword", oldBankerPassword, bankerPassword);
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        int oldAccountBalance = this.accountBalance;
        this.accountBalance = accountBalance;
        changeSupport.firePropertyChange("accountBalance", oldAccountBalance, accountBalance);
    }

    public Integer getBankerNum() {
        return bankerNum;
    }

    public void setBankerNum(Integer bankerNum) {
        Integer oldBankerNum = this.bankerNum;
        this.bankerNum = bankerNum;
        changeSupport.firePropertyChange("bankerNum", oldBankerNum, bankerNum);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bankerNum != null ? bankerNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Banker)) {
            return false;
        }
        Banker other = (Banker) object;
        if ((this.bankerNum == null && other.bankerNum != null) || (this.bankerNum != null && !this.bankerNum.equals(other.bankerNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Banker[ bankerNum=" + bankerNum + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
