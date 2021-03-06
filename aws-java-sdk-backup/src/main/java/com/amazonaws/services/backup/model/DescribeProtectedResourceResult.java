/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProtectedResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastBackupTime;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @return An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     * </p>
     * 
     * @return The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource saved as a recovery point; for example, an EBS volume or an Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastBackupTime(java.util.Date lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time
     *         (UTC). The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastBackupTime() {
        return this.lastBackupTime;
    }

    /**
     * <p>
     * The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastBackupTime
     *        The date and time that a resource was last backed up, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>LastBackupTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectedResourceResult withLastBackupTime(java.util.Date lastBackupTime) {
        setLastBackupTime(lastBackupTime);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getLastBackupTime() != null)
            sb.append("LastBackupTime: ").append(getLastBackupTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectedResourceResult == false)
            return false;
        DescribeProtectedResourceResult other = (DescribeProtectedResourceResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastBackupTime() == null ^ this.getLastBackupTime() == null)
            return false;
        if (other.getLastBackupTime() != null && other.getLastBackupTime().equals(this.getLastBackupTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getLastBackupTime() == null) ? 0 : getLastBackupTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProtectedResourceResult clone() {
        try {
            return (DescribeProtectedResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
