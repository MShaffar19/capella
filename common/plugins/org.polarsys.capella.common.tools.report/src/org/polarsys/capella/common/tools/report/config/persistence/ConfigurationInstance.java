/*******************************************************************************
 * Copyright (c) 2006, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.23 at 05:43:10 PM IST 
//

package org.polarsys.capella.common.tools.report.config.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}OutputConfiguration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ComponentName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "outputConfiguration" })
@XmlRootElement(name = "ConfigurationInstance")
public class ConfigurationInstance implements Cloneable {

  @XmlElement(name = "OutputConfiguration", required = true)
  protected List<OutputConfiguration> outputConfiguration;
  @XmlAttribute(name = "ComponentName", required = true)
  protected String componentName;

  /**
   * Gets the value of the outputConfiguration property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the outputConfiguration property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getOutputConfiguration().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link OutputConfiguration }
   * 
   * 
   */
  public List<OutputConfiguration> getOutputConfiguration() {
    if (outputConfiguration == null) {
      outputConfiguration = new ArrayList<OutputConfiguration>(1);
    }
    return this.outputConfiguration;
  }

  /**
   * Gets the value of the componentName property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getComponentName() {
    return componentName;
  }

  /**
   * Sets the value of the componentName property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setComponentName(String value) {
    this.componentName = value;
  }

  @Override
  public ConfigurationInstance clone() {
    ConfigurationInstance clone = new ConfigurationInstance();
    clone.componentName = componentName;
    
    for (OutputConfiguration config : getOutputConfiguration()) {
      clone.getOutputConfiguration().add((OutputConfiguration)config.clone());
    }
    return clone;
  }

  /**
   * Merge the source into the current instance
   */
  public void merge(ConfigurationInstance source) {
    for (OutputConfiguration srcOutputConf : source.getOutputConfiguration()) {
      for (OutputConfiguration tgtOutputConf : this.getOutputConfiguration()) {
        if ((srcOutputConf.getOutputName() != null)
            && srcOutputConf.getOutputName().equals(tgtOutputConf.getOutputName())) {
          merge(srcOutputConf, tgtOutputConf);
          break;
        }
      }
    }
  }
  
  protected void merge(OutputConfiguration srcOutputConf, OutputConfiguration tgtOutputConf) {
    for (LogLevel srcLogLevel : srcOutputConf.getLogLevel()) {
      for (LogLevel tgtLogLevel : tgtOutputConf.getLogLevel()) {
        if (srcLogLevel.getName().equals(tgtLogLevel.getName())) {
          tgtLogLevel.setValue(srcLogLevel.isValue());
          break;
        }
      }
    }
  }
  

}
