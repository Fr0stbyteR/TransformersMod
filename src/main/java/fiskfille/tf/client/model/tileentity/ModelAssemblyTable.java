package fiskfille.tf.client.model.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAssemblyTable extends ModelBase
{
	public ModelRenderer base1;
	public ModelRenderer top1;
	public ModelRenderer base2;
	public ModelRenderer base3;
	public ModelRenderer base4;
	public ModelRenderer base5;
	public ModelRenderer base6;
	public ModelRenderer base7;
	public ModelRenderer base8;
	public ModelRenderer base9;
	public ModelRenderer top2;
	public ModelRenderer top7;
	public ModelRenderer top11;
	public ModelRenderer top15;
	public ModelRenderer top19;
	public ModelRenderer top3;
	public ModelRenderer top4;
	public ModelRenderer top5;
	public ModelRenderer top6;
	public ModelRenderer top8;
	public ModelRenderer top9;
	public ModelRenderer top10;
	public ModelRenderer top12;
	public ModelRenderer top13;
	public ModelRenderer top14;
	public ModelRenderer top16;
	public ModelRenderer top17;
	public ModelRenderer top18;
	public ModelRenderer top20;
	public ModelRenderer top21;
	public ModelRenderer top22;

	public ModelAssemblyTable()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.top5 = new ModelRenderer(this, 36, 26);
		this.top5.setRotationPoint(10.5F, 1.0F, -1.0F);
		this.top5.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 11, 0.0F);
		this.setRotateAngle(top5, 0.0F, 0.0F, -0.24434609527920614F);
		this.top16 = new ModelRenderer(this, 0, 16);
		this.top16.setRotationPoint(0.5F, 3.0F, 0.5F);
		this.top16.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top16, 0.06981317007977318F, 0.0F, 0.0F);
		this.top4 = new ModelRenderer(this, 30, 23);
		this.top4.setRotationPoint(-1.0F, 1.0F, -1.5F);
		this.top4.addBox(0.0F, -2.0F, 0.0F, 11, 2, 1, 0.0F);
		this.setRotateAngle(top4, -0.24434609527920614F, 0.0F, 0.0F);
		this.base2 = new ModelRenderer(this, 0, 28);
		this.base2.setRotationPoint(-1.0F, 1.0F, -1.0F);
		this.base2.addBox(0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(base2, 0.0F, -0.7853981633974483F, 0.0F);
		this.top20 = new ModelRenderer(this, 0, 16);
		this.top20.setRotationPoint(0.5F, 3.0F, 0.5F);
		this.top20.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top20, 0.06981317007977318F, 0.0F, 0.0F);
		this.base1 = new ModelRenderer(this, 0, 47);
		this.base1.setRotationPoint(-7.0F, 21.0F, -7.0F);
		this.base1.addBox(0.0F, 0.0F, 0.0F, 14, 3, 14, 0.0F);
		this.top15 = new ModelRenderer(this, 0, 10);
		this.top15.setRotationPoint(10.0F, 1.2F, 14.6F);
		this.top15.addBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.setRotateAngle(top15, 0.3490658503988659F, 3.141592653589793F, 0.0F);
		this.base4 = new ModelRenderer(this, 0, 28);
		this.base4.setRotationPoint(-1.0F, 1.0F, 15.0F);
		this.base4.addBox(0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(base4, 0.0F, 0.7853981633974483F, 0.0F);
		this.top2 = new ModelRenderer(this, 0, 16);
		this.top2.setRotationPoint(1.5F, -1.0F, 1.5F);
		this.top2.addBox(-0.5F, 0.0F, -0.5F, 10, 1, 10, 0.0F);
		this.top19 = new ModelRenderer(this, 0, 10);
		this.top19.setRotationPoint(-2.6F, 1.2F, 10.0F);
		this.top19.addBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.setRotateAngle(top19, 0.3490658503988659F, 1.5707963267948966F, 0.0F);
		this.top10 = new ModelRenderer(this, 0, 16);
		this.top10.setRotationPoint(3.0F, 3.0F, 0.5F);
		this.top10.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top10, 0.06981317007977318F, 0.0F, 0.0F);
		this.top7 = new ModelRenderer(this, 0, 10);
		this.top7.setRotationPoint(2.0F, 1.2F, -2.6F);
		this.top7.addBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.setRotateAngle(top7, 0.3490658503988659F, 0.0F, 0.0F);
		this.top12 = new ModelRenderer(this, 0, 16);
		this.top12.setRotationPoint(0.5F, 3.0F, 0.5F);
		this.top12.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top12, 0.06981317007977318F, 0.0F, 0.0F);
		this.top1 = new ModelRenderer(this, 0, 27);
		this.top1.setRotationPoint(1.0F, -8.0F, 1.0F);
		this.top1.addBox(0.0F, 0.0F, 0.0F, 12, 8, 12, 0.0F);
		this.top18 = new ModelRenderer(this, 0, 16);
		this.top18.setRotationPoint(3.0F, 3.0F, 0.5F);
		this.top18.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top18, 0.06981317007977318F, 0.0F, 0.0F);
		this.base9 = new ModelRenderer(this, 0, 0);
		this.base9.setRotationPoint(11.5F, -7.0F, 1.5F);
		this.base9.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.base8 = new ModelRenderer(this, 0, 0);
		this.base8.setRotationPoint(1.5F, -7.0F, 11.5F);
		this.base8.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.top6 = new ModelRenderer(this, 30, 23);
		this.top6.setRotationPoint(-1.0F, 1.0F, 10.5F);
		this.top6.addBox(0.0F, -2.0F, -1.0F, 11, 2, 1, 0.0F);
		this.setRotateAngle(top6, 0.24434609527920614F, 0.0F, 0.0F);
		this.base7 = new ModelRenderer(this, 0, 0);
		this.base7.setRotationPoint(11.5F, -7.0F, 11.5F);
		this.base7.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.top8 = new ModelRenderer(this, 0, 16);
		this.top8.setRotationPoint(0.5F, 3.0F, 0.5F);
		this.top8.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top8, 0.06981317007977318F, 0.0F, 0.0F);
		this.top13 = new ModelRenderer(this, 0, 16);
		this.top13.setRotationPoint(3.0F, 3.0F, 0.5F);
		this.top13.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top13, 0.06981317007977318F, 0.0F, 0.0F);
		this.top14 = new ModelRenderer(this, 0, 16);
		this.top14.setRotationPoint(5.5F, 3.0F, 0.5F);
		this.top14.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top14, 0.06981317007977318F, 0.0F, 0.0F);
		this.top22 = new ModelRenderer(this, 0, 16);
		this.top22.setRotationPoint(5.5F, 3.0F, 0.5F);
		this.top22.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top22, 0.06981317007977318F, 0.0F, 0.0F);
		this.top17 = new ModelRenderer(this, 0, 16);
		this.top17.setRotationPoint(5.5F, 3.0F, 0.5F);
		this.top17.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top17, 0.06981317007977318F, 0.0F, 0.0F);
		this.top11 = new ModelRenderer(this, 0, 10);
		this.top11.setRotationPoint(14.6F, 1.2F, 2.0F);
		this.top11.addBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.setRotateAngle(top11, 0.3490658503988659F, -1.5707963267948966F, 0.0F);
		this.top9 = new ModelRenderer(this, 0, 16);
		this.top9.setRotationPoint(5.5F, 3.0F, 0.5F);
		this.top9.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top9, 0.06981317007977318F, 0.0F, 0.0F);
		this.top21 = new ModelRenderer(this, 0, 16);
		this.top21.setRotationPoint(3.0F, 3.0F, 0.5F);
		this.top21.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(top21, 0.06981317007977318F, 0.0F, 0.0F);
		this.base6 = new ModelRenderer(this, 0, 0);
		this.base6.setRotationPoint(1.5F, -7.0F, 1.5F);
		this.base6.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.top3 = new ModelRenderer(this, 36, 26);
		this.top3.setRotationPoint(-1.5F, 1.0F, -1.0F);
		this.top3.addBox(0.0F, -2.0F, 0.0F, 1, 2, 11, 0.0F);
		this.setRotateAngle(top3, 0.0F, 0.0F, 0.24434609527920614F);
		this.base5 = new ModelRenderer(this, 0, 28);
		this.base5.setRotationPoint(15.0F, 1.0F, 15.0F);
		this.base5.addBox(0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(base5, 0.0F, 2.356194490192345F, 0.0F);
		this.base3 = new ModelRenderer(this, 0, 28);
		this.base3.setRotationPoint(15.0F, 1.0F, -1.0F);
		this.base3.addBox(0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(base3, 0.0F, -2.356194490192345F, 0.0F);
		this.top2.addChild(this.top5);
		this.top15.addChild(this.top16);
		this.top2.addChild(this.top4);
		this.base1.addChild(this.base2);
		this.top19.addChild(this.top20);
		this.top1.addChild(this.top15);
		this.base1.addChild(this.base4);
		this.top1.addChild(this.top2);
		this.top1.addChild(this.top19);
		this.top7.addChild(this.top10);
		this.top1.addChild(this.top7);
		this.top11.addChild(this.top12);
		this.base1.addChild(this.top1);
		this.top15.addChild(this.top18);
		this.base1.addChild(this.base9);
		this.base1.addChild(this.base8);
		this.top2.addChild(this.top6);
		this.base1.addChild(this.base7);
		this.top7.addChild(this.top8);
		this.top11.addChild(this.top13);
		this.top11.addChild(this.top14);
		this.top19.addChild(this.top22);
		this.top15.addChild(this.top17);
		this.top1.addChild(this.top11);
		this.top7.addChild(this.top9);
		this.top19.addChild(this.top21);
		this.base1.addChild(this.base6);
		this.top2.addChild(this.top3);
		this.base1.addChild(this.base5);
		this.base1.addChild(this.base3);
	}

	public void render()
	{ 
		this.base1.render(0.0625F);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
